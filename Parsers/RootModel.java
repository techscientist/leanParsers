import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String timezone;
	public String code_of_conduct;
	public int id;
	public String name;
	public String start_time;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String privacy;
	public String end_time;
	public String schedule_published_on;
	public String background_image;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String description;
	public String organizer_description;
	public String topic;
	public String location_name;
	public VersionModel _version;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String logo;

	public RootModel(CreatorModel creator, String timezone, String code_of_conduct, int id, String name, String start_time, String organizer_name, CopyrightModel copyright, String privacy, String end_time, String schedule_published_on, String background_image, String email, Call_for_papersModel call_for_papers, String type, String description, String organizer_description, String topic, String location_name, VersionModel version, String state, ArrayList<Social_linksModel> social_links, String logo) {

		this._creator = creator;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.name = name;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.privacy = privacy;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.description = description;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.location_name = location_name;
		this._version = version;
		this.state = state;
		this.social_links = social_links;
		this.logo = logo;

	}

}