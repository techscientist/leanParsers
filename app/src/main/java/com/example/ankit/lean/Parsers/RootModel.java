import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String name;
	public VersionModel _version;
	public String location_name;
	public String organizer_description;
	public String description;
	public String start_time;
	public String timezone;
	public String state;
	public String logo;
	public String privacy;
	public String type;
	public CopyrightModel _copyright;
	public String email;
	public int id;
	public String topic;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String background_image;
	public String organizer_name;
	public CreatorModel _creator;

	public RootModel(String end_time, String name, VersionModel version, String location_name, String organizer_description, String description, String start_time, String timezone, String state, String logo, String privacy, String type, CopyrightModel copyright, String email, int id, String topic, String schedule_published_on, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String code_of_conduct, String background_image, String organizer_name, CreatorModel creator) {

		this.end_time = end_time;
		this.name = name;
		this._version = version;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.description = description;
		this.start_time = start_time;
		this.timezone = timezone;
		this.state = state;
		this.logo = logo;
		this.privacy = privacy;
		this.type = type;
		this._copyright = copyright;
		this.email = email;
		this.id = id;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this._creator = creator;

	}

}