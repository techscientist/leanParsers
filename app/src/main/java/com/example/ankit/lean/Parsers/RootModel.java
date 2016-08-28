import java.util.ArrayList;

class RootModel {

	public String description;
	public int id;
	public String name;
	public String email;
	public String end_time;
	public String organizer_name;
	public VersionModel _version;
	public String code_of_conduct;
	public String timezone;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String location_name;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String topic;
	public String type;
	public String schedule_published_on;
	public String privacy;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public CreatorModel _creator;

	public RootModel(String description, int id, String name, String email, String end_time, String organizer_name, VersionModel version, String code_of_conduct, String timezone, String state, ArrayList<Social_linksModel> social_links, String background_image, String location_name, CopyrightModel copyright, String organizer_description, String topic, String type, String schedule_published_on, String privacy, String logo, Call_for_papersModel call_for_papers, String start_time, CreatorModel creator) {

		this.description = description;
		this.id = id;
		this.name = name;
		this.email = email;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.state = state;
		this.social_links = social_links;
		this.background_image = background_image;
		this.location_name = location_name;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this._creator = creator;

	}

}