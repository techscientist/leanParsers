import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String organizer_description;
	public String organizer_name;
	public String location_name;
	public String name;
	public int id;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String description;
	public String logo;
	public String schedule_published_on;
	public String background_image;
	public String timezone;
	public String topic;
	public String email;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String code_of_conduct;
	public String state;
	public VersionModel _version;
	public CreatorModel _creator;

	public RootModel(String start_time, String organizer_description, String organizer_name, String location_name, String name, int id, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String type, String description, String logo, String schedule_published_on, String background_image, String timezone, String topic, String email, String privacy, Call_for_papersModel call_for_papers, String end_time, String code_of_conduct, String state, VersionModel version, CreatorModel creator) {

		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.name = name;
		this.id = id;
		this._copyright = copyright;
		this.social_links = social_links;
		this.type = type;
		this.description = description;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.timezone = timezone;
		this.topic = topic;
		this.email = email;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._version = version;
		this._creator = creator;

	}

}