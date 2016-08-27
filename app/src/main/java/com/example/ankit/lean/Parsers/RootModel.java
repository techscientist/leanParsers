import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String name;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public int id;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String type;
	public String location_name;
	public String start_time;
	public String background_image;
	public String code_of_conduct;
	public String state;
	public String end_time;
	public String privacy;
	public String schedule_published_on;
	public String topic;
	public CreatorModel _creator;
	public String description;
	public String logo;

	public RootModel(String organizer_name, String name, CopyrightModel copyright, VersionModel version, ArrayList<Social_linksModel> social_links, String organizer_description, int id, String email, Call_for_papersModel call_for_papers, String timezone, String type, String location_name, String start_time, String background_image, String code_of_conduct, String state, String end_time, String privacy, String schedule_published_on, String topic, CreatorModel creator, String description, String logo) {

		this.organizer_name = organizer_name;
		this.name = name;
		this._copyright = copyright;
		this._version = version;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.id = id;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.type = type;
		this.location_name = location_name;
		this.start_time = start_time;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.end_time = end_time;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._creator = creator;
		this.description = description;
		this.logo = logo;

	}

}