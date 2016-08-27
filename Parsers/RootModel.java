import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String organizer_name;
	public String description;
	public String privacy;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String type;
	public String logo;
	public CreatorModel _creator;
	public String state;
	public String code_of_conduct;
	public String timezone;
	public String topic;
	public CopyrightModel _copyright;
	public String location_name;
	public int id;
	public String end_time;
	public String schedule_published_on;
	public String email;

	public RootModel(String background_image, String organizer_name, String description, String privacy, String organizer_description, ArrayList<Social_linksModel> social_links, String start_time, String name, Call_for_papersModel call_for_papers, VersionModel version, String type, String logo, CreatorModel creator, String state, String code_of_conduct, String timezone, String topic, CopyrightModel copyright, String location_name, int id, String end_time, String schedule_published_on, String email) {

		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.description = description;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.start_time = start_time;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.type = type;
		this.logo = logo;
		this._creator = creator;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.topic = topic;
		this._copyright = copyright;
		this.location_name = location_name;
		this.id = id;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.email = email;

	}

}