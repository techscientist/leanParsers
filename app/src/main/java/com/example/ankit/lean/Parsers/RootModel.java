import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String logo;
	public String location_name;
	public String code_of_conduct;
	public String name;
	public String type;
	public VersionModel _version;
	public String topic;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String start_time;
	public String state;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String privacy;
	public String organizer_description;
	public String end_time;
	public String background_image;
	public String description;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String email;

	public RootModel(String schedule_published_on, String logo, String location_name, String code_of_conduct, String name, String type, VersionModel version, String topic, CreatorModel creator, CopyrightModel copyright, String start_time, String state, String organizer_name, ArrayList<Social_linksModel> social_links, int id, String privacy, String organizer_description, String end_time, String background_image, String description, String timezone, Call_for_papersModel call_for_papers, String email) {

		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.type = type;
		this._version = version;
		this.topic = topic;
		this._creator = creator;
		this._copyright = copyright;
		this.start_time = start_time;
		this.state = state;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.id = id;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.background_image = background_image;
		this.description = description;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.email = email;

	}

}