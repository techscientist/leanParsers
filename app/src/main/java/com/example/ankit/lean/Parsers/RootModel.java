import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String timezone;
	public String organizer_description;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public VersionModel _version;
	public String organizer_name;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String location_name;
	public String end_time;
	public String code_of_conduct;
	public String description;
	public int id;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String type;
	public String start_time;
	public String state;
	public String logo;
	public String privacy;

	public RootModel(String background_image, String timezone, String organizer_description, String email, Call_for_papersModel call_for_papers, String name, VersionModel version, String organizer_name, String schedule_published_on, CreatorModel creator, String location_name, String end_time, String code_of_conduct, String description, int id, String topic, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String type, String start_time, String state, String logo, String privacy) {

		this.background_image = background_image;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this._version = version;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.location_name = location_name;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.id = id;
		this.topic = topic;
		this.social_links = social_links;
		this._copyright = copyright;
		this.type = type;
		this.start_time = start_time;
		this.state = state;
		this.logo = logo;
		this.privacy = privacy;

	}

}